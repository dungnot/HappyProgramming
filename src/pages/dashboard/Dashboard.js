import {
  TableContainer,
  TableRow,
  TableCell,
  TableHead,
  Table,
  TableBody,

} from "@mui/material";
import MainLayout from "../../component/main-layout/MainLayout";
import styles from "./index.module.css";
import { EyeFill } from "react-bootstrap-icons";

import { useState, useEffect } from "react";


const Dashboard = () => {
  const [report, setReport] = useState([])
  useEffect(() => {
    fetch("http://localhost:9999/Dashboard").then(res => res.json())
      .then(result => {
        setReport(result);
      })

  }, []);



  return (
    <MainLayout
      pageTitle="Dashboard"
      layoutContent={
        <>
          <div className={styles.dbWrapper}>
            <div className={styles.dbHead}>
              <div className={styles.itemWrapper}></div>
              <div className={styles.itemWrapper}></div>
              <div className={styles.itemWrapper}></div>
            </div>
            <h2>Mentor Lists</h2>
            
            <TableContainer
              sx={{
                background: "#E7E7D7",

                border: "5px solid #B5C49C",
                borderRadius: "10px",
              }}
            >
              <div className="container">
                <div className="card-body">
                  <div className="divbtn">

                  </div>

                  <Table sx={{ minWidth: 650 }} aria-label="simple table">
                    <TableHead>
                      <TableRow>
                        <TableCell className={styles.tableCellHead} align="center">
                          BASIC INFO
                        </TableCell>
                        <TableCell className={styles.tableCellHead} align="center">
                          CREATED DATE
                        </TableCell>
                        <TableCell className={styles.tableCellHead} align="center">
                          TAGS
                        </TableCell>
                        <TableCell className={styles.tableCellHead} align="center">
                          Action
                        </TableCell>
                      </TableRow>
                    </TableHead>

                    <TableBody>
                      {report.map((r) => (
                      <TableRow key={r.basicinfo}>
                          <TableCell className={styles.tableCellHead} align="center">
                            {r.BasicInfo}
                          </TableCell>
                          <TableCell className={styles.tableCellHead} align="center">
                            {r.postedDate}
                          </TableCell>
                          <TableCell className={styles.tableCellHead} align="center">
                            {r.Tags}
                          </TableCell>
                          <TableCell className={styles.tableCellHead} align="center">
                            <EyeFill />
                          </TableCell>
                        </TableRow>
                      ))}

                    </TableBody>
                  </Table>

                </div>
              </div>
            </TableContainer>
          </div>
        </>
      }
    />
  );
};

export default Dashboard;
