const express = require("express")
const app = express()
const routes = require("./routes/router")
const path = require("path")
const bodyParser = require("body-parser")

app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())

app.set("views",path.join(__dirname,"views"))
app.set("view engine","ejs")

app.use("/",routes)

app.listen(3002,function(){

    console.log("Server Started at port 3002")
}
)

module.exports = app;