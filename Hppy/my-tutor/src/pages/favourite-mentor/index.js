import MainLayout from "../../components/main-layout";
import MentorAlterImage from "../../assest/svg/mentor-alter.svg";
import { ReactComponent as BackIcon } from "../../assest/svg/back.svg";
import { ReactComponent as NextIcon } from "../../assest/svg/next.svg";
import styles from "./index.module.css";

const FavouriteMentor = () => {
  return (
    <MainLayout
      pageTitle="Favourite Mentors"
      layoutContent={
        <div className={styles.fMWrapper}>
          <div className={styles.mentorList}>
            {[1, 2, 3, 4, 5, 6].map((item) => (
              <div key={item} className={styles.mentorItem}>
                <img src={MentorAlterImage} alt="mentor" />
                <div className={styles.mentorInfo}>
                  <h4>Name</h4>
                  <p>Special skills</p>
                  <span>5</span>
                </div>
              </div>
            ))}
          </div>
          <div className={styles.paginationWrapper}>
            <div className={styles.pagiantionItem}>
              <BackIcon />
            </div>
            <div className={styles.pagiantionItem}>
              <span>1</span>
            </div>
            <div className={styles.pagiantionItem}>
              <span>2</span>
            </div>
            <div className={styles.pagiantionItem}>
              <span>3</span>
            </div>
            <div className={styles.pagiantionItem}>
              <NextIcon />
            </div>
          </div>
        </div>
      }
    />
  );
};

export default FavouriteMentor;
