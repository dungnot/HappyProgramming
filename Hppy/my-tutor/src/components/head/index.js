import { NavLink } from "react-router-dom";
import { ReactComponent as AppLogoLogo } from "../../assest/svg/app-logo.svg";
import styles from "./index.module.css";

const Head = () => {
  return (
    <div className={styles.headWrapper}>
      <div className={styles.iconWrapper}>
        <AppLogoLogo />
      </div>
      <div className={styles.headAction}>
        <NavLink
          to="/find-mentor"
          className={({ isActive }) => {
            return isActive ? styles.activeLink : styles.notActiveLink;
          }}
        >
          Find mentor
        </NavLink>
        <NavLink
          to="/favourite"
          className={({ isActive }) => {
            return isActive ? styles.activeLink : styles.notActiveLink;
          }}
        >
          Favourite
        </NavLink>
        <NavLink
          to="/history"
          className={({ isActive }) => {
            return isActive ? styles.activeLink : styles.notActiveLink;
          }}
        >
          History
        </NavLink>
        <NavLink
          to="/login"
          className={({ isActive }) => {
            return isActive ? styles.activeLink : styles.notActiveLink;
          }}
        >
          Login
        </NavLink>
      </div>
    </div>
  );
};

export default Head;

// ref: https://blog.logrocket.com/how-to-use-svgs-react/
