import { useState } from 'react'
import './App.css'
import Menu from './components/menu'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Menu />

      <main className=''>
        <h1>Teste para ver se esta funcionando</h1>
      </main>
    </>
  )
}

export default App
