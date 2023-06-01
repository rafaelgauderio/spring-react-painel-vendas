import './styles.css';

const Footer = () => {

    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a className='text-success' href="https://github.com/rafaelgauderio" target="_blank" rel="noreferrer">Rafael De Luca</a></p>
                <p className="text-light"><small><strong>Aplicação devenvolvida em React e Java</strong><br />
                    </small></p>
            </div>
        </footer>
    );

}

export default Footer;