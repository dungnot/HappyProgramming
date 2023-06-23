import {useNavigate } from 'react-router-dom';
import '../styles/SignIn.css';
import { } from 'react-bootstrap';
import { useState } from 'react';


const SignUp = () => {
    const navigate = useNavigate();

    const [email,setEmail] = useState('');
    const [password,setPassword] = useState('');
  const handleSubmit = () => {

   console.log('email:' +email );
   console.log('password: ' +password);
    // save user data to state or database
   navigate('/login'); // navigate to sign-in page
  };

    return (
        <div className="login-bg">
    
        <section class="background-radial-gradient overflow-hidden">
      
      
        <div class="container px-4 py-5 px-md-5 text-center text-lg-start my-5">
          <div class="row gx-lg-5 align-items-center mb-5">
            <div class="col-lg-6 mb-5 mb-lg-0" >
              <h1 class="my-5 display-5 fw-bold ls-tight">
                The best offer <br />
                <span >for your business</span>
              </h1>
              <p class="mb-4 opacity-70">
                Lorem ipsum dolor, sit amet consectetur adipisicing elit.
                Temporibus, expedita iusto veniam atque, magni tempora mollitia
                dolorum consequatur nulla, neque debitis eos reprehenderit quasi
                ab ipsum nisi dolorem modi. Quos?
              </p>
            </div>
      
            <div class="col-lg-6 mb-5 mb-lg-0 position-relative">
              <div id="radius-shape-1" class="position-absolute rounded-circle shadow-5-strong"></div>
              <div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>
      
              <div class="card bg-glass">
                <div class="card-body px-4 py-5 px-md-5">
                  <form>
                    <div class="form-outline mb-4">
                      <label class="form-label" for="form3Example3">Email address</label>
                      <input
                       type="email"
                       value={email} onChange={(e) => {setEmail(e.target.value)}}
                       class="form-control" />
                    </div>
                    <div class="form-outline mb-4">
                      
                      <label class="form-label" for="form3Example4">Password</label>
                      <input
                        type="password"
                        value={password} onChange={(e) => {setPassword(e.target.value)}}
                        class="form-control" />
                    </div>
                    <button onClick={handleSubmit} type="submit" class="btn btn-primary btn-block mb-4">
                      Sign up
                    </button>
        
                    <div class="text-center">
                      <p>or sign up with:</p>
                      <button type="button" class="btn btn-link btn-floating mx-1">
                        <i class="fab fa-facebook-f"></i>
                      </button>
      
                      <button type="button" class="btn btn-link btn-floating mx-1">
                        <i class="fab fa-google"></i>
                      </button>
      
                      <button type="button" class="btn btn-link btn-floating mx-1">
                        <i class="fab fa-twitter"></i>
                      </button>
      
                      <button type="button" class="btn btn-link btn-floating mx-1">
                        <i class="fab fa-github"></i>
                      </button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
       
        </div>
    );
}

export default SignUp;
