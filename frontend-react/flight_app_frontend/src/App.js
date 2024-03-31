

import {BrowserRouter, Route, Routes} from "react-router-dom";
import ReactDOM from "react-dom/client";
import Home from "./routes/Home";
import Bookings from "./routes/Bookings";
import Navbar from "./components/Navbar";

export default function App() {
  return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Navbar />}>
            <Route index element={<Home />} />
            <Route path="bookings" element={<Bookings />} />
          </Route>
        </Routes>
      </BrowserRouter>
  );
}

// export default App;

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);