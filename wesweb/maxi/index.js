const express = require('express')
const app = express()
const port = 3000

app.use(express.json());
app.use(express.urlencoded());

app.get('/', (req, res) => {
  res.sendFile(__dirname + "\\index.html")
})

app.get('/index', (req, res) => {
  res.sendfile(__dirname + "\\index.css")
})

app.get('/maxi.jpg', (req, res) => {
  res.sendfile(__dirname + "\\maxi.jpg")
})

app.post('/form', function (req, res) {
  console.log(req.body.form1);
  res.redirect("/");
})
  
app.get('/', (req, res) => res.send('Hello World!'))
app.listen(port, () => console.log(`Example app listening on port port!`))