from flask import Flask
import datetime
app = Flask(__name__)
@app.route('/')
def home():
    now = datetime.datetime.now()
    return f"<h1>Current Date and Time: {now}</h1>"
app.run(debug=True)