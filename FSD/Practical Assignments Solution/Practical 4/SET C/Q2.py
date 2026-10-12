from flask import Flask
app=Flask(__name__)
@app.route('/employee/<string:name>')
def employee(name):
    return f"<h1>The Employee name is {name}</h1>"
app.run(debug=True)