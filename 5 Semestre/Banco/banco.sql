create view vw_pedidos as select rl.id_pedido, sb1.nome as sabor_1, sb2.nome as sabor_2, rl.qntd, round((rl.preco_pizza / rl.qntd), 2) as preco_pizza
from rl_pedido_pizza rl
join tb_sabor sb1 on sb1.id_sabor = rl.id_sabor_1
join tb_sabor sb2 on sb2.id_sabor = rl.id_sabor_2;




create or replace FUNCTION fn_vlrTot (IN data DATE, OUT total NUMERIC(12,2))
as $$
BEGIN
	total = (select sum(preco_entrega) as total from tb_pedido where date(data_pedido) = data);
	total = total + (select sum(rl.preco_pizza)
					from rl_pedido_pizza rl
					join tb_pedido pe on pe.id_pedido  = rl.id_pedido
					where date(pe.data_pedido) = data);
	return;
END;
$$ LANGUAGE plpgsql;




create or replace PROCEDURE sp_realiza_pedido (IN nome_cliente VARCHAR(100), IN valor_entrega NUMERIC(12,2), IN nome_sabor_1 VARCHAR(100), IN nome_sabor_2 VARCHAR(100), IN qntd_pedido INTEGER)
as $$
DECLARE
	id_cliente_ integer;
	id_pedido_ integer;
	
	id_sabor_1_ integer;
	id_sabor_2_ integer;	
	preco_sb1 NUMERIC(12,2);
	preco_sb2 NUMERIC(12,2);
BEGIN
	id_cliente_ := (select id_cliente from tb_cliente where nome = nome_cliente);	
	IF id_cliente_ is null THEN insert into tb_cliente (nome) values (nome_cliente) RETURNING id_cliente INTO id_cliente_; end if;
	
	insert into tb_pedido (id_cliente, data_pedido, preco_entrega) values (id_cliente_, now(), valor_entrega) RETURNING id_pedido into id_pedido_;
	id_sabor_1_ := (select id_sabor from tb_sabor where nome = nome_sabor_1);
	id_sabor_2_ := (select id_sabor from tb_sabor where nome = nome_sabor_2);
	
	preco_sb1 := (select preco/2 from tb_sabor where id_sabor = id_sabor_1_);
	preco_sb2 := (select preco/2 from tb_sabor where id_sabor = id_sabor_2_);
	
	
	insert into rl_pedido_pizza (id_pedido, id_sabor_1, id_sabor_2, qntd, preco_pizza) values
		(id_pedido_, id_sabor_1_, id_sabor_2_, qntd_pedido, (preco_sb1 + preco_sb2) * qntd_pedido);		
END;
$$ LANGUAGE plpgsql;


