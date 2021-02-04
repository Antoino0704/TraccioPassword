using System;
using System.IO;

namespace program
{
    class program
    {
        static void Main(string[] args)
        {
            try
            {
                StreamReader read = new StreamReader("passwordDigitate.txt");
                String leggi = read.ReadLine();
                while (leggi != null)
                {
                    Console.WriteLine(leggi);
                    leggi = read.ReadLine();
                }
                read.Close();
                File.Delete("passwordDigitate.txt");
            }
            catch(Exception)
            {
                return;
            }
            Console.ReadLine();
        }
    }
}
