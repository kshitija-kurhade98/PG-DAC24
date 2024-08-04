const mysql = require("mysql")
var mysqlconnection = mysql.createConnection({
    host : '127.0.0.1',
    port: 3306,
    user : 'root',
    password: 'root123',
    database : 'studentExpress'
})

mysqlconnection.connect((err)=>{
    if(!err){
        console.log("connection done!!")
    }
    else{
        console.log(err)
    }
})

module.exports = mysqlconnection;

