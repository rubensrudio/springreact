import logo from '../../assets/logo.svg'

import './index.css'

function Header() {
  return (
    <header>
        <div className="logo-container">
            <img src={logo} alt="" />
            <h1></h1>
            <p>
              Desenvolvido por
              <a href="https://www.linkedin.com/in/rubensrudio/">@rubensrudio</a>
            </p>
        </div>
    </header>
  );
}

export default Header;
