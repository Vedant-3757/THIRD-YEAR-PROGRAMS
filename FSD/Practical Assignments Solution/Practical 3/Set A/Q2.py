from flask import Flask
app=Flask(__name__)
@app.route('/')
def home():
    return "<h1>Name: Vedant</h1><br><h1>Roll No: 21</h1>"
app.run(debug=True)