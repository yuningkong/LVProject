<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BabyApp</title>

        <style>
            @import url('http://fonts.googleapis.com/css?family=Oswald');

            body {
                margin: 0;
                padding: 0;
                background-attachment: fixed;
                background-size: cover;
            }

            #video-background {
                position: fixed;
                right: 0; 
                bottom: 0;
                min-width: 100%; 
                min-height: 100%;
                width: auto; 
                height: auto;
                z-index: -100;
            }

            article {
                position: absolute;
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;
                margin: 10px;
            }

            h1 {
                position: absolute;
                top: 60%;
                width: 100%;
                font-size: 36px;
                letter-spacing: 3px;
                color: #fff;
                font-family: Oswald, sans-serif;
                text-align: center;
            }
            
            form{
                position: absolute;
                top: 60%;
                width: 100%;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <article>
            <h1>Video Background Snippet</h1>
            <form action="login" method="post">
                Username:<input type="text" name="username" required/>
                </br>
                Password:<input type="password" name="password" required/>
                </br>
                <input type="submit" value="Login"/>
            </form>
        </article>
        <video autoplay="" loop="" class="fillWidth fadeIn animated" poster="https://s3-us-west-2.amazonaws.com/coverr/poster/Traffic-blurred2.jpg" id="video-background">
            <source src="https://www.youtube.com/embed/1C0vMQ6xEvM" type="video/mp4">Your browser does not support the video tag. I suggest you upgrade your browser.
        </video>
    </body>
</html>
