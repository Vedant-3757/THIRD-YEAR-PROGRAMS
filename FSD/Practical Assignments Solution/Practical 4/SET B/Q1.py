from flask import Flask
app=Flask(__name__)
@app.route('/stname/<stname>')
def stname(stname):
    return f"<h1>Welcome to page {stname}</h1>"
app.run(debug=True)