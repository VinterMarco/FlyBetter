import React from 'react';
import Airplane from "../components/Airplane";





const Bookings = () => {

    return (
        <div style={{display: 'flex'}}>
            <div style={{backgroundColor: 'red', width : '50%'}}>
                <Airplane/>
            </div>
            <div style={{backgroundColor: 'green',width : '50%'}}>form</div>
        </div>
    );
};

export default Bookings;