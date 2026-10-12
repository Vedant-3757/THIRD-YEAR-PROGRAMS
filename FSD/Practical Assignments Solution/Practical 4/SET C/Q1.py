from flask import Flask
app=Flask(__name__)
@app.route('/product/<int:id>')
def product(id):
    return f"<h1>The product of {id} is Smartphone</h1>"
app.run(debug=True)