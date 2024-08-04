const express = require("express")
const myrouter = express.Router();
const connection = require("../db/dbconnect")

myrouter.get("/LoginForm",function(req,res){
    res.render("Login");
})

myrouter.get("/login" , function(req,res){
    connection.query("select * from students",function(err,data,fields){
        if(err){
            res.status(500).send("data not found!!")
        }else{
            res.json(data)
        }
    })
})


myrouter.get("/getStudents" , function(req,res){
    connection.query("select * from students",function(err,data,fields){
        if(err){
            res.status(500).send("data not found!!")
        }else{
            res.json(data)
        }
    })
})

myrouter.get("/AddStudent",function(req,res){
    res.render("AddStudents");
})

myrouter.post("/insertNewStudent", function(req,res){

    connection.query("insert into students values (default,?,?,?,?)",[req.body.name,req.body.address,req.body.mobNo,req.body.branch],
        function(err,result){
            if(err){
                res.status(500).send("insertion failed!!")
            }else{
                res.status(200).send("inserted success!!")
            }
        }
    )
})


myrouter.get("/updateStudent", function(req,res){
    res.render("UpdateStudent");
})

myrouter.post("/update",function(req,res){
    connection.query("update students set name=?, address=?, mobNo=?, branch=? where id=?",[req.body.name,req.body.address,req.body.mobNo,req.body.branch,req.body.id],
        function(err,data){
            if(err){
                res.status(500).send("updation failed!!")
            }
            else{
                res.status(200).send("updation success!!")
            }
        }
    )
})

myrouter.get("/deleteStudent",function(req,res){
    res.render("DeleteStudent");
})

myrouter.post("/delete",function(req,res){
    connection.query("delete from students where id=?",[req.body.id],function(err,data){
        if(err){
            res.status(500).send("deletion failed!")
        }else{
            res.status(200).send("deletion success!")
        }
    })
})
module.exports = myrouter;
