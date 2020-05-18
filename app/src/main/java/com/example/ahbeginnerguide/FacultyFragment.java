package com.example.ahbeginnerguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FacultyFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private FacultyAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_mtt, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.facultyrecyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Faculty> staff = new ArrayList<>();
        staff.add(new Faculty("Annette Adair", "adaira@ahsd.org"));
        staff.add(new Faculty("Pat Andrisani", "andrisanip@ahsd.org"));
        staff.add(new Faculty("Pam Antonio", "antoniop@ahsd.org"));
        staff.add(new Faculty("Adam Baker", "bakera@ahsd.org"));
        staff.add(new Faculty("Ann Marie Barrett", "barrettam@ahsd.org"));
        staff.add(new Faculty("Alicia Basalyga", "basalygaa@ahsd.org"));
        staff.add(new Faculty("Edward Bath", "bathe@ahsd.org"));
        staff.add(new Faculty("Dave Bechtel", "bechteld@ahsd.org"));
        staff.add(new Faculty("Joshua Berry", "berryj@ahsd.org"));
        staff.add(new Faculty("Tammy Boyd", "boydt@ahsd.org"));
        staff.add(new Faculty("Deborah Brown", "brownd@ahsd.org"));
        staff.add(new Faculty("Jacqueline Brown", "brownj@ahsd.org"));
        staff.add(new Faculty("Pamela Brown", "brownp@ahsd.org"));
        staff.add(new Faculty("Catherine Buckley", "buckleyc@ahsd.org"));
        staff.add(new Faculty("Linda Bulger", "bulgerl@ahsd.org"));
        staff.add(new Faculty("Jessica Burchell", "burchellj@ahsd.org"));
        staff.add(new Faculty("Jason Burke", "burkej@ahsd.org"));
        staff.add(new Faculty("Timothy Butler", "butlert@ahsd.org"));
        staff.add(new Faculty("Christian Calder", "calderc@ahsd.org"));
        staff.add(new Faculty("Tami Campbell", "campbellt@ahsd.org"));
        staff.add(new Faculty("Diane Carey", "careyd@ahsd.org"));
        staff.add(new Faculty("Krista Carey", "careyk@ahsd.org"));
        staff.add(new Faculty("Dana Cerminaro", "cerminarod@ahsd.org"));
        staff.add(new Faculty("Lydia Chase", "chasel@ahsd.org"));
        staff.add(new Faculty("Basundhara Chattopadhyay", "chattopadhyayb@ahsd.org"));
        staff.add(new Faculty("Alicen Cheshire", "cheshirea@ahsd.org"));
        staff.add(new Faculty("Caroleena Cole", "colec@ahsd.org"));
        staff.add(new Faculty("Cindy Copley", "copleyc@ahsd.org"));
        staff.add(new Faculty("Susan Corwin", "corwins@ahsd.org"));
        staff.add(new Faculty("Allison Covell", "covella@ahsd.org"));
        staff.add(new Faculty("Marcy Curra", "curram@ahsd.org"));
        staff.add(new Faculty("Kerri Davis", "davisk@ahsd.org"));
        staff.add(new Faculty("Lisa Dorunda", "dorundal@ahsd.org"));
        staff.add(new Faculty("Frank Dyska", "dyskaf@ahsd.org"));
        staff.add(new Faculty("Cleveland Elmy", "elmyc@ahsd.org"));
        staff.add(new Faculty("Michelle Fangio", "fangiom@ahsd.org"));
        staff.add(new Faculty("Paulette Farry", "farryp@ahsd.org"));
        staff.add(new Faculty("Heather Fedoryk", "fedorykh@ahsd.org"));
        staff.add(new Faculty("Abigail Fenton", "fentona@ahsd.org"));
        staff.add(new Faculty("Jessica Ferretti", "ferrettij@ahsd.org"));
        staff.add(new Faculty("Lauryn Filipkoski", "filipkoskil@ahsd.org"));
        staff.add(new Faculty("Rebekah Flanagan", "flanaganr@ahsd.org"));
        staff.add(new Faculty("Elizabeth Foster", "fostere@ahsd.org"));
        staff.add(new Faculty("Susan Fulton", "fultons@ahsd.org"));
        staff.add(new Faculty("Anna Galvin", "galvina@ahsd.org"));
        staff.add(new Faculty("Wendy Gardner", "gardnerw@ahsd.org"));
        staff.add(new Faculty("Amy Garrison", "garrisona@ahsd.org"));
        staff.add(new Faculty("Patrick Gaughan", "gaughanp@ahsd.org"));
        staff.add(new Faculty("Sarah Geoffroy", "geoffroys@ahsd.org"));
        staff.add(new Faculty("Brooke Giarratano", "giarratanob@ahsd.org"));
        staff.add(new Faculty("Jacob Gilboy", "gilboyj@ahsd.org"));
        staff.add(new Faculty("Marsha Glick", "glickm@ahsd.org"));
        staff.add(new Faculty("Virginia Gradne", "grandev@ahsd.org"));
        staff.add(new Faculty("Bellette Green", "greenb@ahsd.org"));
        staff.add(new Faculty("Elizabeth Green", "greene@ahsd.org"));
        staff.add(new Faculty("Melissa Groncki", "gronckim@ahsd.org"));
        staff.add(new Faculty("Randy Hanyon", "hanyonr@ahsd.org"));
        staff.add(new Faculty("Jennifer Hayner", "haynerj@ahsd.org"));
        staff.add(new Faculty("Eileen Healey", "healeye@ahsd.org"));
        staff.add(new Faculty("Mari Hendershot", "hendershotm@ahsd.org"));
        staff.add(new Faculty("Rebecca Hetzel", "hetzelr@ahsd.org"));
        staff.add(new Faculty("Michael Hofmann", "hofmannm@ahsd.org"));
        staff.add(new Faculty("Amanda Jones", "jonesa@ahsd.org"));
        staff.add(new Faculty("Gwendolyn Jordan", "jordang@ahsd.org"));
        staff.add(new Faculty("Christine Kallinger-Allen", "kallingerallencj@ahsd.org"));
        staff.add(new Faculty("Dale Keeler", "keelerd@ahsd.org"));
        staff.add(new Faculty("Amy Kelly", "kellya@ahsd.org"));
        staff.add(new Faculty("Thomas Kerrigan", "kerrigant@ahsd.org"));
        staff.add(new Faculty("Angela Kile", "kilea@ahsd.org"));
        staff.add(new Faculty("Melissa Kirtley", "kirtleym@ahsd.org"));
        staff.add(new Faculty("Donna Krenitsky", "krenitskyd@ahsd.org"));
        staff.add(new Faculty("Tom Ksiazek", "ksiazekt@ahsd.org"));
        staff.add(new Faculty("Michele Lacoe", "lacoem@ahsd.org"));
        staff.add(new Faculty("Katie Lane", "lanek@ahsd.org"));
        staff.add(new Faculty("Thomas Lavelle", "lavellet@ahsd.org"));
        staff.add(new Faculty("Nicholas Lazor", "lazorn@ahsd.org"));
        staff.add(new Faculty("Mark Lemoncelli", "lemoncellim@ahsd.org"));
        staff.add(new Faculty("Brandon Libro", "librob@ahsd.org"));
        staff.add(new Faculty("Courtney Long", "longc@ahsd.org"));
        staff.add(new Faculty("Kristen Lovett", "lovettk@ahsd.org"));
        staff.add(new Faculty("Michael Ludka", "ludkam@ahsd.org"));
        staff.add(new Faculty("Matthew Lukachinsky", "lukachinskym@ahsd.org"));
        staff.add(new Faculty("Mary MacMillan", "macmillanm@ahsd.org"));
        staff.add(new Faculty("Megan McAllister", "mcallisterm@ahsd.org"));
        staff.add(new Faculty("Kevin McAndrew", "mcandrewk@ahsd.org"));
        staff.add(new Faculty("Donna McCreary", "mccrearyd@ahsd.org"));
        staff.add(new Faculty("Ellen McGlynn", "mcglynne@ahsd.org"));
        staff.add(new Faculty("Kimberly McGuire", "mcguirek@ahsd.org"));
        staff.add(new Faculty("Makiko McLaughlin", "mclaughlinm@ahsd.org"));
        staff.add(new Faculty("Nancy Melliand", "melliandn@ahsd.org"));
        staff.add(new Faculty("Roseanne Michaels", "michaelsr@ahsd.org"));
        staff.add(new Faculty("Timothy Moher", "mohert@ahsd.org"));
        staff.add(new Faculty("John Monahan", "monahanj@ahsd.org"));
        staff.add(new Faculty("Bryan Montross", "montrossb@ahsd.org"));
        staff.add(new Faculty("Marlene Moore", "moorem@ahsd.org"));
        staff.add(new Faculty("Amy Moran", "morana@ahsd.org"));
        staff.add(new Faculty("Allyson Morcom", "morcoma@ahsd.org"));
        staff.add(new Faculty("Barbara Moss", "mossb@ahsd.org"));
        staff.add(new Faculty("Casey Mrykalo", "mrykaloc@ahsd.org"));
        staff.add(new Faculty("Mark Myers", "myersm@ahsd.org"));
        staff.add(new Faculty("Amanda Nitowski", "nitowskia@ahsd.org"));
        staff.add(new Faculty("Catherine Owens", "owensc@ahsd.org"));
        staff.add(new Faculty("Stephanie Parfrey", "parfreys@ahsd.org"));
        staff.add(new Faculty("Colleen Parsells", "parsellsc@ahsd.org"));
        staff.add(new Faculty("Nicole Pazzaglia", "pazzaglian@ahsd.org"));
        staff.add(new Faculty("Erin Powell", "powelle@ahsd.org"));
        staff.add(new Faculty("Vincent Pricci", "pricciv@ahsd.org"));
        staff.add(new Faculty("Jodi Price", "pricej@ahsd.org"));
        staff.add(new Faculty("Marilyn Pryle", "prylem@ahsd.org"));
        staff.add(new Faculty("Brigid Reese", "reeseb@ahsd.org"));
        staff.add(new Faculty("Joseph Repshis", "repshisj@ahsd.org"));
        staff.add(new Faculty("Tanner Reyan", "reyant@ahsd.org"));
        staff.add(new Faculty("Jeffrey Roberts ", "robertsj@ahsd.org"));
        staff.add(new Faculty("Cyndi Roe", "roec@ahsd.org"));
        staff.add(new Faculty("Allison Rogalewicz", "rogalewicza@ahsd.org"));
        staff.add(new Faculty("Leonard Romanski", "romanskil@ahsd.org"));
        staff.add(new Faculty("Christopher Romeo", "romeoc@ahsd.org"));
        staff.add(new Faculty("Paul Rowlands", "rowlandsp@ahsd.org"));
        staff.add(new Faculty("Donna Rozanski", "rozanskid@ahsd.org"));
        staff.add(new Faculty("Marianne Ruane", "ruanem@ahsd.org"));
        staff.add(new Faculty("Kristen Rude", "rudek@ahsd.org"));
        staff.add(new Faculty("Rosa Sabie", "sabier@ahsd.org"));
        staff.add(new Faculty("Dominick Scarnato", "scarnatod@ahsd.org"));
        staff.add(new Faculty("Jacquelyn Schulte", "schultej@ahsd.org"));
        staff.add(new Faculty("Ashley Shwartz", "shwartza@ahsd.org"));
        staff.add(new Faculty("Sarah Scranta", "scrantas@ahsd.org"));
        staff.add(new Faculty("Todd Sharrow", "sharrowt@ahsd.org"));
        staff.add(new Faculty("Karly Shepherd", "shepherdk@ahsd.org"));
        staff.add(new Faculty("Peter Shivock", "shivockp@ahsd.org"));
        staff.add(new Faculty("Elizabeth Sivakumar", "sivakumare@ahsd.org"));
        staff.add(new Faculty("Carolyn Siwak", "siwakc@ahsd.org"));
        staff.add(new Faculty("Peter Smith", "smithp@ahsd.org"));
        staff.add(new Faculty("Andrew Snyder", "snydera@ahsd.org"));
        staff.add(new Faculty("Lynne Spangenberg", "spangenbergl@ahsd.org"));
        staff.add(new Faculty("Kerra Spindler", "spindlerk@ahsd.org"));
        staff.add(new Faculty("Beth Stone", "stoneb@ahsd.org"));
        staff.add(new Faculty("Linda Stone", "stonel@ahsd.org"));
        staff.add(new Faculty("Pat Stroney", "stroneyp@ahsd.org"));
        staff.add(new Faculty("Eric Stroyan", "stroyane@ahsd.org"));
        staff.add(new Faculty("Frank Summa", "summaf@ahsd.org"));
        staff.add(new Faculty("Jennifer Tarr", "tarrj@ahsd.org"));
        staff.add(new Faculty("Connie Tartaglione", "tartaglionec@ahsd.org"));
        staff.add(new Faculty("Lee Ann Theony", "theonyla@ahsd.org"));
        staff.add(new Faculty("Brigid Thomas", "thomasb@ahsd.org"));
        staff.add(new Faculty("John Uram", "uramj@ahsd.org"));
        staff.add(new Faculty("Daniel Vannan", "vannand@ahsd.org"));
        staff.add(new Faculty("Sasha Wagner", "wagners@ahsd.org"));
        staff.add(new Faculty("Lori Walter", "walterl@ahsd.org"));
        staff.add(new Faculty("Diane Waters", "watersd@ahsd.org"));
        staff.add(new Faculty("Bryan Weber", "weberb@ahsd.org"));
        staff.add(new Faculty("William White", "whitew@ahsd.org"));
        staff.add(new Faculty("Tammy Williams", "williamst@ahsd.org"));
        staff.add(new Faculty("Amy Wojcik", "wojcika@ahsd.org"));
        staff.add(new Faculty("Craig Yerke", "yerkec@ahsd.org"));

        mAdapter = new FacultyAdapter(staff);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;

    }
}
