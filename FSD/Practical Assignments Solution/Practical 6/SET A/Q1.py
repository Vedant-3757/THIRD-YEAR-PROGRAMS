from flask import Flask
import datetime
app=Flask(__name__)
@app.route('/date')
def date():
    a=datetime.date.today()
    return f"Todays Date is: {a}"
app.run(debug=True)