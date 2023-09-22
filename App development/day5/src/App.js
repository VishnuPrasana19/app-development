import './App.css';
import Homepage from './Components/Homepage';

import SideBar from './Components/SideBar';
  import SignUp from './Components/SignUp';
 import {Routes, Route, BrowserRouter} from 'react-router-dom';
// import Dashboard from './Components/Dashboard';
// import EcommerceDashboard from './Redux/EcommerceDashboard';
import AdminLogin from './Components/AdminLogin';
//import CustomerLogin from './Components/CustomerLogin'

function App() {
  return (
    <div className="App">

    <BrowserRouter>
   <Routes>
    <Route path='/' element={<Homepage/>}/>
     <Route path='/Adminlogin' element={<AdminLogin/>}/>
     <Route path='/SideBar' element={<SideBar/>}/>
     <Route path='/SignUp' element={<SignUp/>}/>
     

    </Routes>
    </BrowserRouter>
    
    </div>  
    );
  }
  export default App;