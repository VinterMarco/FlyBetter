import React, { useEffect, useState } from "react";

const BookingForm = () => {
    const [users, setUsers] = useState([]);
    const [flights, setFlights] = useState([]);
    const [selectedUser, setSelectedUser] = useState("");
    const [selectedFlight, setSelectedFlight] = useState("");

    useEffect(() => {
        const fetchUsers = async () => {
            try {
                const response = await fetch('http://localhost:8080/api/users/all');
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                const data = await response.json();
                setUsers(data);
            } catch (error) {
                console.error('Error fetching users:', error);
            }
        };

        const fetchFlights = async () => {
            try {
                const response = await fetch('http://localhost:8080/api/flights/all');
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                const data = await response.json();
                setFlights(data);
            } catch (error) {
                console.error('Error fetching flights:', error);
            }
        };

        fetchUsers();
        fetchFlights();
    }, []);

    const handleSave = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/bookings/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    user: {
                        id: Number(selectedUser)
                    },
                    flight: {
                        id: Number(selectedFlight)
                    }
                })
            });
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            console.log('Booking saved successfully!');
        } catch (error) {
            console.error('Error saving booking:', error);
        }
    };


    return (
        <div style={{ backgroundColor: 'transparent', height: '50%', display: 'flex', flexDirection: 'c' }} className="container">
            <div style={{
                backgroundColor: 'transparent',
                display: 'flex',
                flexDirection: 'column',
                margin: "auto",
                width: '50%',
                gap: '10px',
                height: '200px'
            }}>
                <div style={{ fontSize: '20px' }}>
                    <label style={{ fontSize: '14px', position: 'relative', }} htmlFor="users">Choose an existing user:</label>
                    <select
                        style={{ font: 'inherit', width: '100%' }}
                        name="users"
                        id="users"
                        onChange={(e) => setSelectedUser(e.target.value)}
                    >
                        {users.map(user => (
                            <option value={user.id} key={user.id}>{user.fullName}</option>
                        ))}
                    </select>
                    <span style={{ position: 'relative',  }}>
                        <label style={{ fontSize: '14px', position: 'relative',  }} htmlFor="flights">Choose an existing flight:</label>
                        <select
                            style={{ font: 'inherit', width: '100%' }}
                            name="flights"
                            id="flights"
                            onChange={(e) => setSelectedFlight(e.target.value)}
                        >
                            {flights.map(flight => (
                                <option value={flight.id} key={flight.id}>{flight.destinationAirport} - {flight.departureAirport}</option>
                            ))}
                        </select>
                    </span>
                    <button style={{ height: '20%', width: '100%', marginTop : '20px' }} onClick={handleSave}>Save</button>
                </div>
            </div>
        </div>
    );
};

export default BookingForm;
