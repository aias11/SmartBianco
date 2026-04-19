import { useState } from 'react'
import './App.css'
import Menu from './components/menu'
import background from './assets/imagemdefundo.png'
import { Button } from 'bootstrap'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Menu paginaAtual="home" />
      <main className=''>
        <section className='bannerPrincipal'>
          <img
            src={background}
            alt='imagem de fundo'
            className='background'
          />
          <div className='conteudoBanner'>
            <div className='fundoTexto'>
              <h1>LIBERTE SEU POTENCIAL</h1>
            </div>
            <div className='fundoTexto'>
              <h3>SMARTBIANCO: ENERGIA, MOVIMENTO & RESULTADO</h3>
            </div>
            <div className='botoes'>
              <button className='estilobotoes'>Matricule-se</button>
              <button className='estilobotoesAulas'>Veja as aulas</button>
            </div>
          </div>
        </section>
      </main>
    </>
  )
}

export default App
