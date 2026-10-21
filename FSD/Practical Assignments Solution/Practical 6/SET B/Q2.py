from flask import Flask,render_template
app=Flask(__name__)
emp=[{'id':1,'name':'Vedz'},
     {'id':2,'name':'jkl'},
     {'id':3,'name':'ghi'},
     {'id':4,'name':'def'},
     {'id':5,'name':'abc'}]
@app.route('/')
def home():
    return emp
app.run(debug=True)