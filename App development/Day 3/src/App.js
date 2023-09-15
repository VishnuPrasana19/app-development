
import './App.css';
import SignUp from './Components/SignUp/SignUp';
import {Routes, Route, BrowserRouter} from 'react-router-dom';
import Login from './Components/SignUp/Login';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<SignUp/>}/>
          <Route path='/login' element={<Login/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
