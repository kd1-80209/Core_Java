package com.assign;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * try(CandidateDao dao = new CandidateDao()) {
		 * System.out.print("Enter candidate id to be deleted: "); int id =
		 * sc.nextInt(); int cnt = dao.deleteById(id);
		 * System.out.println("Candidates deleted: " + cnt); } // dao.close(); catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try(CandidateDao dao = new CandidateDao()) { List<Candidate> list =
		 * dao.findAll(); list.forEach(c -> System.out.println(c)); } // dao.close();
		 * catch (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try(CandidateDao dao = new CandidateDao()) {
		 * System.out.print("Enter party: "); String party = sc.next(); List<Candidate>
		 * list = dao.findByParty(party); list.forEach(c -> System.out.println(c)); } //
		 * dao.close(); catch (Exception e) { e.printStackTrace(); }
		 */

//		try (CandidateDao dao = new CandidateDao()) {
//			System.out.print("Enter candidate id (to vote): ");
//			int candidateId = sc.nextInt();
//			int cnt = dao.incrementVote(candidateId);
//			System.out.println("Rows updated: " + cnt);
//		} // dao.close();
//		catch (Exception e) {
//			e.printStackTrace();
//	}

//		try (CandidateDao doa = new CandidateDao()) {
//			System.out.print("Enter Name = ");
//			String name = sc.next();
//			System.out.print("Enter Party = ");
//			String party = sc.next();
//			System.out.print("Enter no. of Votes = ");
//			Integer votes = sc.nextInt();
//
//			Candidate c = new Candidate();
//			c.setName(name);
//			c.setParty(party);
//			c.setVotes(votes);
//
//			int cnt = doa.addCandidate(c);
//			System.out.println("Rows Inserted  = " + cnt);
//
//		} // doa.close();
//		catch (SQLException e) {
//			e.printStackTrace();
//		}

//		try (CandidateDao doa = new CandidateDao()) {
//			System.out.print("Enter Id of Candidate to Update = ");
//			int id = sc.nextInt();
//			System.out.print("Enter Name = ");
//			String name = sc.next();
//			System.out.print("Enter Name = ");
//			String party = sc.next();
//
//			Candidate c = new Candidate();
//			c.setId(id);
//			c.setName(name);
//			c.setParty(party);
//			
//			int cnt = doa.updateCandidate(c);
//			System.out.println("Rows Updated = " + cnt);
//
//		} // doa.close;
//		catch (SQLException e) {
//
//			e.printStackTrace();
//		}

		try (CandidateDao doa = new CandidateDao()) {
			List<PartyVotes> list = doa.voteCountPartywise();
			list.forEach(c -> System.out.println(c));

		} // doa.close();
		catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
