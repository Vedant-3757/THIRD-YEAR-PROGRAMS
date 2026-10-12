from flask import Flask
app=Flask(__name__)
@app.route('/contact')
def contact():
    return "<h1>This is Contact Page</h1>"
@app.route('/services')
def services():
    return "<h1>this is Services Page</h1>"
app.run(debug=True)