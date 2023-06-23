import { } from 'react-bootstrap';
import Image from '../assets/2.png';
import Online from '../assets/5.png';
import '../styles/Home.css';
import { } from 'react-icons';
import { FaSearch } from 'react-icons/fa';


const MainHeader = () => {
    return (
        <header className="main_header">
            <div className="container main_header-container">
                <div className="main_header-center">
                    <h2>Welcome to Happy Programming!
                        <br /> Take the first step toward unlocking your potential and
                        let our mentors guide you towards success in the exciting world of coding
                    </h2>
                     <div class="box">
                        <input type="text" placeholder="Search for skill" />
                        <FaSearch />Find Mentor
                    </div> 
                </div>

                <div className="row">
                    <div className="col-md-6 d-flex align-items-center justify-content-center">
                    <img
                        className="img-resize"
                        src={Image}
                        alt="Main Header Assest" />
                    </div>
                    <div className="col-md-6 d-flex align-items-center justify-content-center">
                        <div className="overlap-group">
                            <h2 className="title headline-fr">
                                Popular searches
                            </h2>
                            <div className="aspnet-container subtext-fr">
                                <div className="aspnet">
                                    Asp.net
                                </div>

                            </div>
                            <div className="overlap-group2">
                                <div className="java subtext-fr">
                                    Java
                                </div>
                            </div>
                            <div className="overlap-group4">
                                <div className="c subtext-fr">
                                    C++
                                </div>
                            </div>
                            <div className="overlap-group3">
                                <div className="spring-boot subtext-fr">
                                    Spring boot
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

                <div className="destintion">
                <h2>Empower Your Programming Journey</h2>
                <p className="des-1">Discover the powerful features that make Happy Programming the ultimate destintion for 
                aspring programmers and coding enthusiasts. Our platform offers a range of Innovative tools
                and personalized support to help you thrive in your programming journey.</p>  
                <h2>Personalized Mentor Matching</h2>
                <p>Our platform utilizes advanced algorithms to match you with 
                mentors based on your programming goals,
                experirnce level, and preferred programming languages.</p>
            
                <div className="image">
                    <img
                        src={Online}
                        alt="img" />
                    </div>

                </div>
                
            </div>



        </header>
        
    );
}
export default MainHeader;
