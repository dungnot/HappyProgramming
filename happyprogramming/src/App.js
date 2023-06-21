

import { BrowserRouter, Routes, Route } from "react-router-dom"
import Favorite from './pages/Favorite';
import FindMentor from './pages/FindMentor';
import History from './pages/History';
import SigIn from './pages/SignIn';
import SigUp from './pages/SignUp';
import Home from './pages/Home';


function App() {
  return (
    <BrowserRouter>
   
    <Routes>
    
    <Route path='/' element ={<Home/>}/>
     <Route path='/findmentor' element ={<FindMentor/>}/>
     <Route path='/favorite' element ={<Favorite/>}/>
     <Route path='history' element ={<History/>}/>
     <Route path='/login' element ={<SigIn/>}/>
     <Route path='/resgiter' element ={<SigUp/>}/>
    
    
    </Routes>
    
  
    
    </BrowserRouter>
  );
}

export default App;
