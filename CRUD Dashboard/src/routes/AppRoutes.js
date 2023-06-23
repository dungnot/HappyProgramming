import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Favorite from '../pages/Favorite';
import FindMentor from '../pages/FindMentor';
import History from '../pages/History';
import Home from '../pages/Home';
import SigIn from '../pages/SignIn';
import SigUp from '../pages/SignUp';

import Booking from '../pages/booking/bookings';
import Dashboard from '../pages/dashboard/Dashboard';
import FavouriteMentor from '../pages/favorite/Favorite';


const AppRoutes = () => {
    return ( 
        <Router>
     <Routes>
     <Route path='/' element ={<Home/>}/>
    <Route path='/findmentor' element ={<FindMentor/>}/>
     <Route path='/favorite' element ={<Favorite/>}/>
     <Route path='history' element ={<History/>}/>
     <Route path='/login' element ={<SigIn/>}/>
     <Route path='/resgiter' element ={<SigUp/>}/>
     <Route path='/bookings' element ={<Booking/>}/>
    <Route path='/dashboard' element ={<Dashboard/>}/>
    <Route path='/favorite-mentor' element ={<FavouriteMentor/>}/>
     </Routes>
     {/*Call Dashboard Admin */}

    
    
     </Router> 
    );
}
 
export default AppRoutes ;