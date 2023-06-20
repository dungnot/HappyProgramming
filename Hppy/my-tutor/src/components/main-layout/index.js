import Footer from "../footer";
import Head from "../head";
import Sidebar from "../sidebar";
import styles from "./index.module.css";

const MainLayout = ({ pageTitle, layoutContent }) => {
  return (
    <div className={styles.layoutWrapper}>
      <Head />
      <h2 className={styles.pageTitle}>{pageTitle}</h2>
      <div className={styles.layoutContent}>
        <Sidebar />
        {layoutContent}
      </div>
      <Footer />
    </div>
  );
};

export default MainLayout;
