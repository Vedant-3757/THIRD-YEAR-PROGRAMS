from flask import Flask
app=Flask(__name__)
@app.route('/home')
def home():
    return "<h2>This is home page</h2>"
@app.route('/student')
def student():
    return "<h2>This is Student page</h2>"
@app.route('/faculty')
def faculty():
    return "<h2>This is Faculty page</h2>"
app.run(debug=True)
