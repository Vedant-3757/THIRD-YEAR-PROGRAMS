from flask import Flask
app=Flask(__name__)
@app.route('/square/<int:num>')
def square(num):
    return f"<h1>The Square of {num} is {num*num}</h1>"
app.run(debug=True)