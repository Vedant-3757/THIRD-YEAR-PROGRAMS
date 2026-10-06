from flask import Flask,jsonify,request
app=Flask(__name__)
movies=[{"id":1,"title":"Jawan"},
   {"id":2,"title":"Avengers"}]
@app.route('/movies',methods=['GET'])
def home():
    return jsonify(movies)
@app.route('/movies/<int:id>',methods=['GET'])
def get(id):
    for movie in movies:
        if movie['id']==id:
            return jsonify(movie)
        else:
            return jsonify({
                "MSG":"MOVIE NOT FOUND"
            }),404
app.run(debug=True)