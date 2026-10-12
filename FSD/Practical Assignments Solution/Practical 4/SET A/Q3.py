from flask import Flask
app=Flask(__name__)
@app.route('/course/<name>')
def course(name):
    return f"Welcome to {name} course"
app.run(debug=True)