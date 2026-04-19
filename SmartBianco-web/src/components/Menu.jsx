import { useState } from 'react'
import './Menu.css'
import Logo from '../assets/LogoSmartBianco.png'

function Menu() {
  const [count, setCount] = useState(0)

  return (
    <>
      <section className='menuContainer'>

        <img
          src={Logo}
          alt='Logo da empresa'
          className="logo"
        >
        </img>

        <div className=''>
          <a className="textoMenu" href=''><p>Home</p></a>
          <a className="textoMenu" href=''><p>Aulas</p></a>
          <a className="textoMenu" href=''><p>Equipe</p></a>
          <a className="textoMenu" href=''><p>Planos</p></a>
          <a className="textoMenu" href=''><p>Matricule-se</p></a>
        </div>
      </section>
    </>
  )
}

export default Menu