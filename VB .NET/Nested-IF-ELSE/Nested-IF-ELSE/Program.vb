Module program
    Sub main()
        Console.WriteLine("Enter Your Name : ")
        Dim name As String = Console.ReadLine()
        Console.WriteLine("Enter your Age : ")
        Dim age As Integer = Console.ReadLine()
        Console.WriteLine("Have you Entered Your Information : ")
        Dim confirmation As String = Console.ReadLine()
        If confirmation = "yes" Then
            If age > 18 Then
                Console.WriteLine("YOU HAVE ACCESS TO THIS DATING APPLICATION !")
            Else
                Console.WriteLine("YOU ARE RESTRICTED DUE TO UNDER-AGE !")
            End If
        Else
            Console.WriteLine("PLEASE FILL INFO PROPERLY !")

        End If
    End Sub
End Module