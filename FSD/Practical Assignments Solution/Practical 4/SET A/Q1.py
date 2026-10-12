from flask import Flask
app=Flask(__name__)
@app.route('/home')
def home():
    return "<h1>This is Home Page</h1>"
@app.route('/about')
def about():
    return "<h1>This is About Page</h1>"
app.run(debug=True)