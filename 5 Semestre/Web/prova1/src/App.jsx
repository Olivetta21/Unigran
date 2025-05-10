import { useState } from 'react'
import './App.css'

function calcs(f, op, s) {
  try {
    f = Number(f);
    s = Number(s);
    if (isNaN(f) || isNaN(s)) throw new Error();
  } catch (e) {
    return 0;
  }

  switch (op) {
    case '+': return f + s;
    case '-': return f - s;
    case '*': return f * s;
    case '/': {
      if (s == 0) return 0; 
      return f / s;
    }
  }

  return 0;
}


function App() {
  const [first, setFirst] = useState(0);
  const [secnd, setSecnd] = useState(0);
  const [selec, setSelec] = useState('');
  const [res, setRes] = useState('');

  function calcule(op) {
    setRes(calcs(first, op, secnd));
    setSelec(op);
  }

  function clearAll() {
    setFirst('');
    setSecnd('');
    setRes('');
  }

  return (
    <>
      <div className='calculadora'>
        <input type="number" value={first} onChange={(e) => {setFirst(e.target.value)}} />
        <input type="number" value={secnd} onChange={(e) => {setSecnd(e.target.value)}} />
        <div className='op-cont'>
          <button onClick={() => calcule('+')} className={selec == '+' ? 'selec' : ''}> <strong> + </strong>  </button>
          <button onClick={() => calcule('-')} className={selec == '-' ? 'selec' : ''}> <strong> - </strong>  </button>
          <button onClick={() => calcule('*')} className={selec == '*' ? 'selec' : ''}> <strong> * </strong>  </button>
          <button onClick={() => calcule('/')} className={selec == '/' ? 'selec' : ''}> <strong> / </strong>  </button>
        </div>
        <div className='res-cont'>
          <p className='rc-item'> {res} </p>
          <button className='rc-item' onClick={() => clearAll()}> Limpar </button>
        </div>
      </div>
    </>
  )
}

export default App
