Module program
    Sub main()
        Dim a As String = "<---Welcome to Registration Portal--->" & Environment.NewLine
        Console.WriteLine(a)
        Console.WriteLine("Enter Your Name : ")
        Dim b As String = Console.ReadLine()
        Console.WriteLine("Enter Your Age : ")
        Dim c As Integer = Console.ReadLine()
        Console.WriteLine("Enter Your College Name : ")
        Dim d As String = Console.ReadLine()
        Console.WriteLine("Enter your Class Name : ")
        Dim e As String = Console.ReadLine()
        Console.WriteLine("Enter your Percentage : ")
        Dim f As Double = Console.ReadLine() & Environment.NewLine
        Console.WriteLine("Have you Filled Your Whole information : ")
        Dim g As String = Console.ReadLine()
        If g = "yes" Then
            If c > 20 Then
                Console.WriteLine("Your Name : " & b)
                Console.WriteLine("Your Age : " & c)
                Console.WriteLine("College Name : " & d)
                Console.WriteLine("Class Name : " & e)
                Console.WriteLine("Your Percentage : " & f)
                Console.WriteLine()
                Console.WriteLine("Entered Information is Correct ?? ")
                Dim h As String = Console.ReadLine()
                If h = "yes" Then
                    Console.WriteLine("CONGRATULATIONS YOU HAVE REGISTERED SUCCESSFULLY !!!")
                End If
            Else
                Console.WriteLine("SORRY YOU ARE NOT ELIGIBLE !!!")
            End If
        End If
    End Sub
End Module