from flask import Flask
app=Flask(__name__)
@app.route('/employee')
def employee():
    return f"<h1>Employee Page</h1>"
@app.route('/department')
def department():
    return f"<h1>Department Page</h1>"
@app.route('/contact')
def contact():
    return f"<h1>Contact Page</h1>"
app.run(debug=True)
