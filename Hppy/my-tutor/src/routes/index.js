import { Route, Routes } from "react-router-dom";
import Dashboard from "../pages/dashboard";
import FavouriteMentor from "../pages/favourite-mentor";
import Booking from "../pages/booking";

const AppRoute = () => {
  return (
    <Routes>
      <Route path="/" element={<></>} />
      <Route path="/dashboard" element={<Dashboard />} />
      <Route path="/bookings" element={<Booking />} />
      <Route path="/favorite-mentor" element={<FavouriteMentor />} />
      <Route path="*" element={<>Chưa làm ha</>} />
    </Routes>
  );
};

export default AppRoute;
