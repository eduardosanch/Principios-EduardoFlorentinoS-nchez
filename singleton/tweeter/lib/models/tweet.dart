class tweet{
   final int id;
   final String tweet;

   Tweet({
	required this.id,
	required this.tweet,	
	});

   // convert JSON to Tweet object

   factory Tweet.fromJson(Map<String, dynamic> json){
	return Tweet(
	  id: json['id'] ?? '',
	  tweet: json['tweet'] ?? '',
	);
       }

   // convert Tweet object to JSON
   Map>String, dynamic> toJson(){
	return {
	   'id': id,
	   'tweet': tweet,
	};
   }


}
