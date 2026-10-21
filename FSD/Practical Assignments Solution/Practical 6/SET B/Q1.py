from flask import Flask
app=Flask(__name__)
students=[
    {'name':'Kunal','class':'TY BSC IT'},
    {'name':'Akash','class':'TY BUSINESSS MANAGEMENT'},
    {'name':'Datta','class':'TY GRAPHICS & DESIGN'},
    {'name':'Mayur','class':'PLAINN BSC'},
    {'name':'Onkar','class':'PLAIN BSC'}
]
@app.route('/')
def home():
    return "This is Homepage !!"
@app.route('/getinfo/<string:name>')
def getinfo(name):
    for student in students:
        if student['name'].lower()==name:
            return student
        else:
            return "Student Not Found"
app.run(debug=True)
