import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
} from "@mui/material";
import MainLayout from "../../components/main-layout";
import styles from "./index.module.css";

function createData(mentorId, mentorName, imageUrl, email, dateString) {
  return { mentorId, mentorName, imageUrl, email, dateString };
}

const rows = [
  createData(
    "mentor1",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor2",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor3",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor4",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor5",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor6",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
  createData(
    "mentor7",
    "nguyen trong tai",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTu5iuH9GH49VUAv0qvlrKiFRnsgEC6maRA9g&usqp=CAU",
    "email@gmail.com",
    "08, August, 2023"
  ),
];

const Dashboard = () => {
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
                  {rows.map((row) => (
                    <TableRow
                      key={row.mentorId}
                      sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
                    >
                      <TableCell align="center">
                        <div className={styles.mentorInfoWrapper}>
                          <img src={row.imageUrl} alt="avatar" />
                          <div className={styles.infoLeft}>
                            <h4>{row.mentorName}</h4>
                            <p>{row.email}</p>
                          </div>
                        </div>
                      </TableCell>
                      <TableCell align="center">{row.dateString}</TableCell>
                      <TableCell align="center">
                        <div className={styles.block}></div>
                      </TableCell>
                      <TableCell align="center">
                        <div className={styles.block}></div>
                      </TableCell>
                    </TableRow>
                  ))}
                </TableBody>
              </Table>
            </TableContainer>
          </div>
        </>
      }
    />
  );
};

export default Dashboard;
