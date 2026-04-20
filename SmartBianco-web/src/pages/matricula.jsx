import { useState } from "react";
import Menu from "../components/Menu";
import './Matricula.css'

function Matricula() {
  const [count, setCount] = useState(0)

return(
  <>
  <Menu paginaAtual={Matricula}/>
  </>
)
}
export default Matricula