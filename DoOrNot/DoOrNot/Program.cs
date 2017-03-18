using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DoOrNot
{
    class Program
    {
        static double realPreference(
            double current, double other,
            double currentForOther, double otherForCurrent,
            double multiplicateur = 1)
        {
            if (multiplicateur < 0.0000001)
            {
                return 0;
            }
            else
            {
                return current * (1 - currentForOther) * multiplicateur + realPreference(other, current, otherForCurrent, currentForOther, multiplicateur * currentForOther);
            }
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Y aller :");
            double his, her, hisForHer, herForHim;
            his = 1;
            her = 0.1;
            hisForHer = 0.9;
            herForHim = 0.8;
            double heGo = realPreference(his, her, hisForHer, herForHim);
            double sheGo = realPreference(her, his, herForHim, hisForHer);
            double heNotGo = realPreference(1-his, 1-her, hisForHer, herForHim);
            double sheNotGo = realPreference(1-her, 1-his, herForHim, hisForHer);
            Console.WriteLine("Clément veut y aller à " + heGo.ToString());
            Console.WriteLine("Alexanne veut y aller à " + sheGo.ToString());
            Console.WriteLine("Clément veut ne pas y aller y aller à " + heNotGo.ToString());
            Console.WriteLine("Alexanne veut ne pas y aller à " + sheNotGo.ToString());
            Console.Read();
        }
    }
}
