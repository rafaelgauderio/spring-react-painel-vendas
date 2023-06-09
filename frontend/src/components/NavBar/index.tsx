import { Link } from 'react-router-dom';
import ImgDeLuca from '../../assets/images/logo_deluca.png';
import './styles.css';

const NavBar = () => {

    return (
        <div>
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-dark border-bottom shadow-sm">
                <div className="container">
                    <nav className="my-2 my-md-0 mr-md-3">
                        <Link to="/">
                            <img src={ImgDeLuca} alt="rafaelgauderio" width="100" />
                        </Link>
                    </nav>
                </div>
            </div>
        </div>
    );
}

export default NavBar;