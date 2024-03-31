import React from 'react';
import Airplane from "../components/Airplane";
import BookingForm from "../components/BookingForm";





const Bookings = () => {

    return (
        <div style={{display: 'flex', fontFamily : 'sans-serif'}}>
            <div style={{backgroundColor: 'transparent', width: '50%'}}>
                <h2 style={{marginLeft : '10%'}}>Plane Seats Map</h2>
                <Airplane/>
            </div>
            <div style={{backgroundColor: 'black', color: 'white', width: '50%'}}>
                <h2 style={{marginLeft: '10%'}}>Make a reservation!</h2>
                <div style={{height: '100px'}}></div>
                <BookingForm/>
            </div>
        </div>
    );
};

export default Bookings;