const express = require('express');
const mysql = require('mysql2');
const app = express();

const connection = mysql.createConnection({
  host: process.env.DB_HOST || 'localhost',
  user: process.env.DB_USER || 'testuser',
  password: process.env.DB_PASSWORD || 'testpass',
  database: process.env.DB_NAME || 'testdb'
});

connection.connect(err => {
  if (err) {
    console.error('Kết nối MySQL thất bại:', err);
  } else {
    console.log(' Đã kết nối MySQL!');
  }
});

app.get('/', (req, res) => {
  res.send('Hello from Node.js with MySQL!');
});

app.listen(3000, () => {
  console.log('Server đang chạy tại http://localhost:3000');
});
