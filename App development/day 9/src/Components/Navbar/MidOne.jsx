import React from "react"
import { useNavigate } from "react-router-dom";
import '../../Styles/MidOne.css'

const MidOne = () => {
  const navigate = useNavigate()
   return <div className='parent'>
        
        <div>
          <div className='card' onClick={()=> navigate("/Eyeglasses")}>
            <div>
              <img src='https://static1.lenskart.com/media/desktop/img/Apr22/a2.png' alt='chasma'  className='image' />
              <p>Eyeglasses</p>
            </div>
          </div>
        </div>
        
<div>
          <div className='card' onClick={()=> navigate("/Sunglasses")}>
            <div>
              <img src='https://static1.lenskart.com/media/desktop/img/Apr22/b2.png' alt='chasma'  className='image' />
              <p>Sunglasses</p>
            </div>
          </div>
        </div>


        <div>
        <div className='card' onClick={()=> navigate("/Eyeglasses")}>
          <div>
            <img src='https://static1.lenskart.com/media/desktop/img/Apr22/a2.png' alt='chasma'  className='image' />
            <p>Eyeglasses</p>
          </div>
        </div>
      </div>

        <div>
          <div className='card' onClick={()=> navigate("/Sunglasses")}>
            <div>
              <img src='https://static1.lenskart.com/media/desktop/img/Apr22/b2.png' alt='chasma'  className='image' />
              <p>Sunglasses</p>
            </div>
          </div>
        </div>
        
        <div>
          <div className='card' onClick={()=> navigate("/Computerglasses")}>
            <div>
              <img src='https://static1.lenskart.com/media/desktop/img/Apr22/d2.png' alt='chasma'  className='image' />
              <p>Computer Glasses</p>
            </div>
          </div>
        </div>
        <div>

        <div>
        <div className='card' onClick={()=> navigate("/Eyeglasses")}>
          <div>
            <img src='https://static1.lenskart.com/media/desktop/img/Apr22/a2.png' alt='chasma'  className='image' />
            <p>Eyeglasses</p>
          </div>
        </div>
      </div>

          
        </div>
    </div>
};

export default MidOne;