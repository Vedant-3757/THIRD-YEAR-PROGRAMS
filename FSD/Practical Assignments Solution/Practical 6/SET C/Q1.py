from flask import Flask
app=Flask(__name__)
emp=[{'id':1,'name':'Vedant','course':'BSC IT'},
     {'id':2,'name':'Kunal','course':'BSC IT'},
     {'id':3,'name':'Datta','course':'BSC IT'}]
@app.route('/')
def home():
    return "This is Homepage"
@app.route('/employee')
def employee():
    return f"{emp}"
app.run(debug=True)